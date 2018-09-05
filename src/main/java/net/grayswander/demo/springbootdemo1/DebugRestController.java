package net.grayswander.demo.springbootdemo1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/debug")
public class DebugRestController {

    @RequestMapping(value = "/echo", method = {RequestMethod.GET, RequestMethod.POST})
    public String getEcho(@RequestParam MultiValueMap<String, String> parameters, @RequestHeader HttpHeaders headers, HttpServletRequest request
    ) {


        Map<String, Object> response_map = new HashMap<String, Object>() {{
            put("parameters", parameters);
            put("headers", headers);
//            put("x_ms_client_principal", finalX_ms_client_principal);
//            put("x_ms_client_principal_type", finalXms_type);
//            put("attributes", attributes);
//            put("principal", principal);
//            put("authentication", authentication);
//            put("userdetails", authentication.getPrincipal());
        }};


        String r = null;
        try {
            r = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response_map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(r);

        return r;
    }

}
