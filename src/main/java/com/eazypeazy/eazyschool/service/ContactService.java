package com.eazypeazy.eazyschool.service;
import com.eazypeazy.eazyschool.model.Contact;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;


@Slf4j
@Service
@RequestScope
@SessionScope
@ApplicationScope
public class ContactService {
//    private static Logger log = LoggerFactory.getLogger(ContactService.class);

    private int counter = 0;

    public ContactService(){
        System.out.println("Contact service bean initialized");
    }

    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        log.info(contact.toString());
        return isSaved;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
