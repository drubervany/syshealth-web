package br.com.syshealth.web.cucumber.stepdefs;

import br.com.syshealth.web.SysHealthWebApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SysHealthWebApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
