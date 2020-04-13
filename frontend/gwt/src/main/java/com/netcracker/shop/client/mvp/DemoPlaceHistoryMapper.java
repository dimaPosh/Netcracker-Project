package com.netcracker.shop.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.netcracker.shop.client.mvp.place.ContactsPlace;
import com.netcracker.shop.client.mvp.place.MailPlace;
import com.netcracker.shop.client.mvp.place.ProductPlace;
import com.netcracker.shop.client.mvp.place.TasksPlace;

@WithTokenizers({MailPlace.Tokenizer.class, ContactsPlace.Tokenizer.class, TasksPlace.Tokenizer.class, ProductPlace.Tokenizer.class})
public interface DemoPlaceHistoryMapper extends PlaceHistoryMapper {
}
