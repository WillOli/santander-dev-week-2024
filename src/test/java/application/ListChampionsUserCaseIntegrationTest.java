package application;

import com.willdev.swd24.Application;
import com.willdev.swd24.application.ListChampionsUseCase;
import com.willdev.swd24.domain.model.Champions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = Application.class)
public class ListChampionsUserCaseIntegrationTest {

    @Autowired
    private ListChampionsUseCase listChampionsUserCase;

    @Test
    public void testeFindListChampions() {
        List<Champions> champions = listChampionsUserCase.findAll();

        Assertions.assertEquals(12, champions.size());
    }
}
