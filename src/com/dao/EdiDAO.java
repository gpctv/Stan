// default package
// Generated 2018/7/11 �W�� 11:53:02 by Hibernate Tools 3.4.0.CR1
package com.dao;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.transaction.annotation.Transactional;

/**
 * Home object for domain model class Edi.
 * @see .Edi
 * @author Hibernate Tools
 */
@Transactional
public class EdiDAO {

	private static final Log log = LogFactory.getLog(EdiDAO.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void persist(Edi transientInstance) {
		log.debug("persisting Edi instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Edi instance) {
		log.debug("attaching dirty Edi instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Edi instance) {
		log.debug("attaching clean Edi instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Edi persistentInstance) {
		log.debug("deleting Edi instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Edi merge(Edi detachedInstance) {
		log.debug("merging Edi instance");
		try {
			Edi result = (Edi) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Edi findById(java.math.BigDecimal id) {
		log.debug("getting Edi instance with id: " + id);
		try {
			Edi instance = (Edi) sessionFactory.getCurrentSession().get("Edi", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Edi instance) {
		log.debug("finding Edi instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("Edi").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
