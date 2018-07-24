package com.bo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Edi;
import com.dao.EdiDAO;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
@Transactional
public class EdiBo {
	private static final Logger log = LoggerFactory.getLogger(EdiBo.class);
	private SessionFactory sessionFactory;
	private EdiDAO ediDAO;
	public void setEdiDAO(EdiDAO ediDAO) {
		this.ediDAO=ediDAO;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public List<String> getStorer() {
		try {
		Query query =sessionFactory.getCurrentSession()
				.getNamedQuery("com.dao.edi.storer");
		List<String> t=query.list();
		return t;
		}catch(Exception e) {
			log.error("EdiBo error:[#0]", e);
		}
		return null;
	}
	
	public List<Edi> getEdiTable(){
		try {
			Query query =sessionFactory.getCurrentSession()
					.getNamedQuery("com.dao.edi.storer2");
			List<Edi> ediList=new ArrayList<Edi>();
			ediList=query.list();
//			List<Object[]> t=query.list();
//			for(Object[] o:t) {
//				Edi edi=new Edi();
//				edi.setDatastream((BigDecimal)o[0] );
//				edi.setDescription(o[1].toString());
//				edi.setActive((BigDecimal)o[2]);
//				edi.setStorer(o[3].toString());
//				ediList.add(edi);
//			}
			 
			return ediList;
		}catch(Exception e) {
			log.error("EdiBo error:[#0]", e);
		}
		return null;
	}
	
	public void saveEdi(List<Edi> ediTable) {
		for(Edi edi:ediTable) {
		this.ediDAO.attachDirty(edi);	 
			 
		}
		
	}
	
}
