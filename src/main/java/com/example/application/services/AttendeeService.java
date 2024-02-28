package com.example.application.services;

import com.example.application.model.Attendee;
import com.example.application.model.AttendeeRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.BrowserCallable;
import dev.hilla.crud.ListRepositoryService;


@BrowserCallable
@AnonymousAllowed
public class AttendeeService extends ListRepositoryService<Attendee, Long, AttendeeRepository> {

}
