package main.sbdesignquiz.services;

import jakarta.mail.internet.MimeMessage;
import main.sbdesignquiz.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;
import org.thymeleaf.context.Context;
import java.util.Map;

@Service
public class mailService {

    @Autowired
    private static JavaMailSender mailSender;

    @Autowired
    private static TemplateEngine templateEngine;

    public mailService(JavaMailSender mailSender, TemplateEngine templateEngine){
        this.mailSender = mailSender;
        this.templateEngine = templateEngine;
    }


    private static final ObjectMapper objectMapper = new ObjectMapper();
    public static void sendEmail(Order order){
        Map<String, Object> vars = objectMapper.convertValue(order, new TypeReference<>() {});
        Context context = new Context();
        context.setVariables(vars);
        System.out.println(vars);
        MimeMessage  message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, "UTF-8");
        String text = templateEngine.process("email/order-confirm", context);
        try {
            helper.setTo(order.getEmail());
            helper.setText(text, true);
            mailSender.send(message);
            System.out.println("Почта отправлена на " + order.getEmail());
        } catch (Exception e){
            System.out.println(e);
        }


    }
}
