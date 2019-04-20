package com.Project.RestaurantBooking.System.Repositories.CustomerRepositories;

import com.Project.RestaurantBooking.System.Models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class customerRepositoryImpl implements CustomerRepositoryCustom{

    @Autowired
    EntityManager entityManager;

}
