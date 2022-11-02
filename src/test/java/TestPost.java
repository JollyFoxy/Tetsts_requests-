import org.testng.annotations.Test;

public class TestPost {
    StepUser stepUser = new StepUser();
    @Test
    public void firstTest(){
        stepUser.createUser("Carl","Clean Manager","89502458776");
    }

    @Test
    public void secondTest(){

    }
}

