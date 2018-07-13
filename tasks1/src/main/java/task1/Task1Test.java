package task1;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class Task1Test {

    @Test
    public void solution() throws Exception {
        String result = new Task1().solution();
        Assertions.assertThat(result).isEqualToIgnoringCase("Я думаю, быть программистом - это круто");
    }

}
