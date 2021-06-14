package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {
    //burda @ diyince step definitions getiriyor.Adımlarımızı yazabiliyoruz.
    @Then("3 sn bekle")
    //bunların muhakkak bir method la bağlı olması lazım bu yüzden methodunu yazıyoruz.

    public void waitForTreeSecond() throws InterruptedException {
        Thread.sleep(3000);
        //kızınca alt+enter yapıp Add exception to method signature diyoruz.
    }
    @Given("Hello World")
    public void helloWorld(){
        System.out.println("Hello world");
    }

}