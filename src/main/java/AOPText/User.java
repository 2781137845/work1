package AOPText;

import org.springframework.stereotype.Component;

@Component

public class User {
    public void add(){
        int q=2;
        System.out.println("add......."+q);

    }
}
