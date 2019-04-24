package MaterialReviewTask;

import java.util.ArrayList;

public class Colony {
    ArrayList<Honeybee> beeList;

    public Colony() {
        beeList = new ArrayList<>();
    }

    public void join(Honeybee bee) {
        beeList.add(bee);
    }

    public void startWork() {
    }
}
