package org.springframework.data.mongodb.example.generics;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class GenericModel<T extends SubDocument> {

	private T subDocument;
	private List<T> subDocumentList;
	private T[] subDocumentArray;

	public T getSubDocument() {
		return subDocument;
	}

	public void setSubDocument(T subDocument) {
		this.subDocument = subDocument;
	}

	public List<T> getSubDocumentList() {
		return subDocumentList;
	}

	public void setSubDocumentList(List<T> subDocumentList) {
		this.subDocumentList = subDocumentList;
	}

	public T[] getSubDocumentArray() {
		return subDocumentArray;
	}

	public void setSubDocumentArray(T[] subDocumentArray) {
		this.subDocumentArray = subDocumentArray;
	}

}
