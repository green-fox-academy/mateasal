package com.example.workshop1.controller;

import com.example.workshop1.repository.ILogRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(MainRestController.class)
public class MainRestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  MockMvc mockMvc;

  @MockBean
  ILogRepository iLogRepository;

  @Test
  public void emptyDoubling_missingParam() throws Exception {
    mockMvc.perform(get("/doubling"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error", is("Please provide an input!")));
  }

  @Test
  public void doubling15_successful() throws Exception {
    mockMvc.perform(get("/doubling/?input=15"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result", is(30)));
  }

  @Test
  public void greeting_missingNameAndTitle() throws Exception {
    mockMvc.perform(get("/greeter"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error", is("Please provide a name and a title!")));
  }

  @Test
  public void greeting_missingName() throws Exception {
    mockMvc.perform(get("/greeter?title=oboa"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error", is("Please provide a name!")));
  }

  @Test
  public void greeting_missingTitle() throws Exception {
    mockMvc.perform(get("/greeter?name=DonaldJTrump"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error", is("Please provide a title!")));
  }

  @Test
  public void greeting_successful() throws Exception {
    mockMvc.perform(get("/greeter?name=DonaldJTrump&title=oboa"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.welcome_message", is("Oh, hi there DonaldJTrump, my dear oboa!")));
  }

  @Test
  public void appending_successful() throws Exception {
    mockMvc.perform(get("/appenda/kuk"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.appended", is("kuka")));
  }

  @Test
  public void doUntil_error() throws Exception {
    mockMvc.perform(post("/dountil/ho")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": \"5\"}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error", is("Please provide a number!")));
  }

  @Test
  public void doUntilSum_successful() throws Exception {
    mockMvc.perform(post("/dountil/sum")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": \"5\"}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result", is(15)));
  }

  @Test
  public void doUntilFactor_error() throws Exception {
    mockMvc.perform(post("/dountil/factor")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": \"5\"}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result", is(120)));
  }

  @Test
  public void arrays_error() throws Exception {
    mockMvc.perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"sum\"}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error", is("Please provide what to do with the numbers!")));
  }

  @Test
  public void arraysSumming_success() throws Exception {
    mockMvc.perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"sum\", \"numbers\": [1, 2, 5, 10]}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result", is(18)));
  }

  @Test
  public void arraysMultiplying_success() throws Exception {
    mockMvc.perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"multiply\", \"numbers\": [1, 2, 5, 10]}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result", is(100)));
  }

  @Test
  public void arraysDoubling_success() throws Exception {
    List array = Arrays.asList(2, 4, 10, 20);

    mockMvc.perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"double\", \"numbers\": [1, 2, 5, 10]}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result", is(array)));
  }
}