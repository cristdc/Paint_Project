package clases;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TipoPincelTest {

    @Test
    public void test1(){

        List<Pincel> tipoPincel = TipoPincel.getPinceles();
        Assert.assertEquals(6,tipoPincel.size());

        for(int i =0; i<tipoPincel.size(); i++){
            Assert.assertEquals(TipoPincel.getPinceles().get(i),tipoPincel.get(i));
        }
    }

}