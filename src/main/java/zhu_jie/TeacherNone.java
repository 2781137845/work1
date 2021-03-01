package zhu_jie;

import org.springframework.stereotype.Controller;

@Controller(value = "teacherNone1")
public class TeacherNone implements Teacher{
    @Override
    public void name() {
        System.out.println("name......");
    }
}
