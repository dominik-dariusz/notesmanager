package com.todoit.training.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MessageServiceAsync {
	void getMessages (AsyncCallback<ArrayList<Message>> callback);
	void createMessage (Message newMessage, AsyncCallback<Void> callback);
	void createNewMessage (String newNote, AsyncCallback<String> callback);
	void removeMessage (String messageID, AsyncCallback<Boolean> callback);
	void updateMessage (Message newMessage, AsyncCallback<Boolean> callback);
	void createTest (Message newMessage, AsyncCallback<ArrayList<Message>> callback);
}
