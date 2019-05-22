package com.example.simba.controller;

import com.example.simba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

  BankAccount bankAccount;
  List<BankAccount> accountList;

  BankController() {
    accountList = new ArrayList<>();
    accountList.add(new BankAccount("Simba", 2000, "lion", true, true));
    accountList.add(new BankAccount("Timon", 30, "meerkat", false, true));
    accountList.add(new BankAccount("Zazu", 1000, "hornbill", false, true));
    accountList.add(new BankAccount("Mufasa", 200, "lion", true, true));
    accountList.add(new BankAccount("Pumba", 1200, "warthog", false, true));
    accountList.add(new BankAccount("Azizi", 1150, "hyena", false, false));
  }

  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showAccount(Model model) {
    bankAccount = new BankAccount("Simba", 2000, "lion", true, true);
    model.addAttribute("account", bankAccount);
    return "account";
  }

  @RequestMapping(path = "/cheerme", method = RequestMethod.GET)
  public String cheerMe(Model model) {
    model.addAttribute("cheering",
            "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "cheer";
  }

  @RequestMapping(path = "/accountlist", method = RequestMethod.GET)
  public String listAccounts(Model model) {
    model.addAttribute("listOfAccounts", accountList);
    return "accountlist";
  }

  @PostMapping("/form")
  public String handlingForm(Model model, int val) {
    accountList.get(val).setBalance(accountList.get(val).getBalance() + 10);
    model.addAttribute("listOfAccounts", accountList);
    return "accountlist";
  }
}