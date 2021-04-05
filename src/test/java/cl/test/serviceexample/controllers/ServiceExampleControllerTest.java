package cl.test.serviceexample.controllers;

import cl.test.serviceexample.controllers.entities.ClientResponse;
import cl.test.serviceexample.services.ServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringJUnitWebConfig
@WebMvcTest(ServiceExampleController.class)
public class ServiceExampleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ServiceImpl service;

    @Test
    public void getService() throws Exception {
        when(service.getService(1L, "Juan")).thenReturn(ClientResponse.builder().id(1L).name("Juan").build());
        this.mockMvc.perform(get("/get?id=1&name=Juan")).andDo(print()).andExpect(status().isOk());
    }

}
