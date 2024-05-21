package com.example.mywebap.mywebappspringboot.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import jakarta.servlet.http.HttpSession;
import org.apache.catalina.session.StandardSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {HomeController.class})
@ExtendWith(SpringExtension.class)
class HomeControllerDiffblueTest {
    @Autowired
    private HomeController homeController;

    /**
     * Method under test: {@link HomeController#about(HttpSession)}
     */
    @Test
    void testAbout() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange
        HomeController homeController = new HomeController();

        // Act and Assert
        assertEquals("about", homeController.about(new MockHttpSession()));
    }

    /**
     * Method under test: {@link HomeController#about(HttpSession)}
     */
    @Test
    void testAbout2() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange
        HomeController homeController = new HomeController();
        StandardSession req = mock(StandardSession.class);
        when(req.getAttribute(Mockito.<String>any())).thenReturn("Attribute");

        // Act
        String actualAboutResult = homeController.about(req);

        // Assert
        verify(req).getAttribute(eq("person"));
        assertEquals("about", actualAboutResult);
    }

    /**
     * Method under test: {@link HomeController#home(HttpSession)}
     */
    @Test
    void testHome() throws Exception {
        // Arrange
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");

        // Act and Assert
        MockMvcBuilders.standaloneSetup(homeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("home"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("home"));
    }

    /**
     * Method under test: {@link HomeController#home(HttpSession)}
     */
    @Test
    void testHome2() throws Exception {
        // Arrange
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");
        requestBuilder.contentType("https://example.org/example");

        // Act and Assert
        MockMvcBuilders.standaloneSetup(homeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("home"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("home"));
    }
}
