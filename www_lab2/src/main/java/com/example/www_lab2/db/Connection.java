package com.example.www_lab2.db;

import com.example.www_lab2.model.Employee;
import com.example.www_lab2.model.Product;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Connection {
    private static Connection instance;
    private SessionFactory sessionFactory;

    private Connection(){
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
        Metadata metadata = new MetadataSources(standardServiceRegistry)
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Product.class)
                .getMetadataBuilder().build();
        sessionFactory = metadata.getSessionFactoryBuilder().build();
        System.out.println("connect!!");
    }
    public static Connection getInstance(){
        if(instance == null){
            instance = new Connection();
        }
        return instance;
    }
    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
