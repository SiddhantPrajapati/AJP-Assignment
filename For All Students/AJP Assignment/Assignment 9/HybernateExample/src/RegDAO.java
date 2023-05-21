package com.dao;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import com.vo.RegVO;
public class RegDAO {
  public void Insert(RegVO regVO) {
    SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
    session.save(regVO);
    transaction.commit();
    session.close();
  }
  public List Search() {
    SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
    Query q = session.createQuery("from RegVO");
    List searchList = q.list();
    transaction.commit();
    session.close();
    return searchList;
  }
  public void Delete(RegVO regVO1) {
    try {
      SessionFactory sessionFactory = new
      AnnotationConfiguration().configure().buildSessionFactory();
      Session session = sessionFactory.openSession();
      Transaction transaction = session.beginTransaction();
      session.delete(regVO1);
      transaction.commit();
      session.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  public List Edit(RegVO regVO2) {
    List ls1 = new ArrayList();
    try {
      SessionFactory sessionFactory = new
      AnnotationConfiguration().configure().buildSessionFactory();
      Session session = sessionFactory.openSession();
      Transaction transaction = session.beginTransaction();
      Query q = session.createQuery("From RegVO where id='" + regVO2.getId() + "'");
      ls1 = q.list();
      ((RegDAO) session).Edit(regVO2);
      transaction.commit();
      session.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return ls1;
  }
  public void Update(RegVO regVO3) {
    try {
      SessionFactory sessionFactory = new
      AnnotationConfiguration().configure().buildSessionFactory();
      Session session = sessionFactory.openSession();
      Transaction transaction = session.beginTransaction();
      session.update(regVO3);
      transaction.commit();
      session.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}