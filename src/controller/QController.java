package controller;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import model.Customer;

public class QController
{
	private Queue<Customer>customerLine = new LinkedBlockingQueue<Customer>();
	
	public QController()
	{
		customerLine.add(new Customer());
		customerLine.add(new Customer());
		customerLine.peek();
		customerLine.remove(customerLine);
		customerLine.remove(customerLine);
	}
}
