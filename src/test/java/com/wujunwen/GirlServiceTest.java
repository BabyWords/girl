package com.wujunwen;

import com.wujunwen.Domain.Girl;
import com.wujunwen.Service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Keven on 2017/10/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void findOneTest(){
        Girl girl=girlService.findOne(17);
        Assert.assertEquals((new Integer(20)),girl.getAge());
    }
}
