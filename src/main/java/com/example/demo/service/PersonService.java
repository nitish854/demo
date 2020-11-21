package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Coordinates;
import com.example.demo.entity.Person;
import com.example.demo.repository.CordinatesRepository;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	@Autowired
	private CordinatesRepository crepository;
	
	
	@Autowired
	private CordinatesRepository cRepository;
	
    public List<Person> findAll() {
        return (List<Person>) repository.findAll();
    }

    
    public List<Coordinates> findAllC() {
        return (List<Coordinates>) crepository.findAll();
    }
    
    public Person addPerson() {
       Person p = new Person();
       p.setAge(2);
       p.setDescriotion("sdfasfsafsafsadgdfgsf3qr <html> adsfarwqer	wq\\n 	qrwdsfasdfaw43 	"
       		+ "q rewdaf adfasdf42rwqtrw wrfsadf 00\\n wdfasfasdfaw4refddE4Q WEERDAFASDF<PRE> \\n    "
       		+ "ASDFAFQWRFXZAWERFHGADFWARF</html> asdfasdfa4awerawfwarfwrsdfasfsafsafsadgdfgsf3qr <html> adsfarwqer	"
       		+ "wq\\n 	qrwdsfasdfaw43 	q rewdaf adfasdf42rwqtrw wrfsadf 00\\n wdfasfasdfaw4refddE4Q WEERDAFASDF<PRE> "
       		+ "\\n    ASDFAFQWRFXZAWERFHGADFWARF</html> asdfasdfa4awerawfwarfwrsdfasfsafsafsadgdfgsf3qr <html> adsfarwqer	"
       		+ "wq\\n 	qrwdsfasdfaw43 	q rewdaf adfasdf42rwqtrw wrfsadf 00\\n wdfasfasdfaw4refddE4Q WEERDAFASDF<PRE> \\n   "
       		+ " ASDFAFQWRFXZAWERFHGADFWARF</html> asdfasdfa4awerawfwarfwrsdfasfsafsafsadgdfgsf3qr <html> adsfarwqer	wq\\n 	"
       		+ "qrwdsfasdfaw43 	q rewdaf adfasdf42rwqtrw wrfsadf 00\\n wdfasfasdfaw4refddE4Q WEERDAFASDF<PRE> \\n   "
       		+ " ASDFAFQWRFXZAWERFHGADFWARF</html> asdfasdfa4awerawfwarfwrsdfasfsafsafsadgdfgsf3qr <html> adsfarwqer	wq\\n 	"
       		+ "qrwdsfasdfaw43 	q rewdaf adfasdf42rwqtrw wrfsadf 00\\n wdfasfasdfaw4refddE4Q WEERDAFASDF<PRE> \\n   "
       		+ " ASDFAFQWRFXZAWERFHGADFWARF</html> asdfasdfa4awerawfwarfwrsdfasfsafsafsadgdfgsf3qr <html> adsfarwqer	wq\\n "
       		+ "	qrwdsfasdfaw43 	q rewdaf adfasdf42rwqtrw wrfsadf 00\\n wdfasfasdfaw4refddE4Q WEERDAFASDF<PRE> \\n    "
       		+ "ASDFAFQWRFXZAWERFHGADFWARF</html> asdfasdfa4awerawfwarfwrsdfasfsafsafsadgdfgsf3qr <html> adsfarwqer	wq\\n 	"
       		+ "qrwdsfasdfaw43 	q rewdaf adfasdf42rwqtrw wrfsadf 00\\n wdfasfasdfaw4refddE4Q WEERDAFASDF<PRE> \\n    "
       		+ "ASDFAFQWRFXZAWERFHGADFWARF</html> asdfasdfa4awerawfwarfwrsdfasfsafsafsadgdfgsf3qr <html> adsfarwqer	wq\\n 	"
       		+ "qrwdsfasdfaw43 	q rewdaf adfasdf42rwqtrw wrfsadf 00\\n wdfasfasdfaw4refddE4Q WEERDAFASDF<PRE> \\n    "
       		+ "ASDFAFQWRFXZAWERFHGADFWARF</html> asdfasdfa4awerawfwarfwrsdfasfsafsafsadgdfgsf3qr <html> adsfarwqer	wq\\n 	"
       		+ "qrwdsfasdfaw43 	q rewdaf adfasdf42rwqtrw wrfsadf 00\\n wdfasfasdfaw4refddE4Q WEERDAFASDF<PRE> \\n    "
       		+ "ASDFAFQWRFXZAWERFHGADFWARF</html> asdfasdfa4awerawfwarfwrsdfasfsafsafsadgdfgsf3qr <html> adsfarwqer	wq\\n 	"
       		+ "qrwdsfasdfaw43 	q rewdaf adfasdf42rwqtrw wrfsadf 00\\n wdfasfasdfaw4refddE4Q WEERDAFASDF<PRE> \\n    "
       		+ "ASDFAFQWRFXZAWERFHGADFWARF</html> asdfasdfa4awerawfwarfwrsdfasfsafsafsadgdfgsf3qr <html> adsfarwqer	wq\\n 	"
       		+ "qrwdsfasdfaw43 	q rewdaf adfasdf42rwqtrw wrfsadf 00\\n wdfasfasdfaw4refddE4Q WEERDAFASDF<PRE> \\n    "
       		+ "ASDFAFQWRFXZAWERFHGADFWARF</html> asdfasdfa4awerawfwarfwrsdfasfsafsafsadgdfgsf3qr <html> adsfarwqer	wq\\n 	"
       		+ "qrwdsfasdfaw43 	q rewdaf adfasdf42rwqtrw wrfsadf 00\\n wdfasfasdfaw4refddE4Q WEERDAFASDF<PRE> \\n    "
       		+ "ASDFAFQWRFXZAWERFHGADFWARF</html> asdfasdfa4awerawfwarfwr'\r\n");
       p.setFirstName("nitish");
       p.setLastName("singla");
       
       Coordinates c= new Coordinates();
	   c.setLocation(new Point(-73.9667, 40.78));
//	   c.setLocations(Arrays.asList(new Point(-73.9667, 40.78), new Point(73.9667, 40.78)));
       cRepository.save(c);
	   
       return repository.save(p);
    }
}
