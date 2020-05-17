package Amir.gl99;

public interface  DAO<T> {
	public  T create(T obj);
	public  T find(String id);
	public  T updatet(T obj);
	public  T delete(T obj);
}