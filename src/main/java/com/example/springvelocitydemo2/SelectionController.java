package com.example.springvelocitydemo2;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.StringWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Controller
public class SelectionController {

    @GetMapping(value = "/selection", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String selectionController() {

        //Populate the form with data, this can be static or data driven
        VelocityContext context = new VelocityContext();
        Map<String, String[]> selection = new HashMap<>();
        selection.put("Cars", new String[] {"Volvo", "SAAB","Opel","Audi"} );
        selection.put("Busses", new String[] {"Toyota", "Volkswagen","Daimler","Ford"} );
        context.put("selection", selection);

        Template template = Velocity.getTemplate("selectionForm.vm");
        StringWriter sw = new StringWriter();
        template.merge(context,sw );
        return sw.toString();
    }


    @PostMapping(value = "/selection")
    @ResponseBody
    public String selectionControllerSubmit(Selection selection) {
        System.out.println(selection);
        return selectionController();
    }

}
