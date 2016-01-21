package br.com.springbootgradle.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableSpringDataWebSupport
@SpringBootApplication
@ComponentScan(basePackages = "br.com.springbootgradle")
public class Application implements CommandLineRunner{
		
	public static void main(String[] args) throws Exception {
			
        SpringApplication.run(Application.class, args);             
    }
    
    
    
    
    
    
    
    
    
//    @Autowired
//	private AddressRepository addressRepository;
//	
//	@Autowired
//	private DocumentRepository documentRepository;
//	
//	@Autowired
//	private PersonRepository peopleRepository;
//	                                                                                                                                                                                                                                                 
//	@Autowired
//	private PhoneRepository phoneRepository;
	
//	@Autowired
//	AnnotationConfigApplicationContext context;
	
	@Override
	public void run(String... args) throws Exception {
//		testSelect();
		
//		testInsert();
		
//		findSort();
		
//		findPagination();
		
//		findByAge();
		
//		findByAgeBetween();
		
//		findByFirtNameOrAge();
		
//		findByCity();
		
//		findByStreet();
	}

//	private void findByStreet() {
//
//		addressRepository.findByStreet("Rua").forEach(System.out::println);
//	}
//
//	private void findByCity() {
//
//		addressRepository.buscaPorCidade("Araraquara").forEach(System.out::println);
//	}
//
//	private void findByFirtNameOrAge() {
//
//		peopleRepository.findByFirstNameOrAge("Renan", 29).forEach(System.out::println);
//	}
//
//	private void findByAgeBetween() {
//
//		peopleRepository.findByLastNameAndAgeBetween("Fulano", 20, 30).forEach(System.out::println);
//	}
//
//	private void findByAge() {
//
//		peopleRepository.findByAge(26).forEach(System.out::println);
//		peopleRepository.findByAgeNot(26).forEach(System.out::println);
//	}
//
//	private void findPagination() {
//
//		Page<Address> page1 = addressRepository.findAll(new PageRequest(0, 2));
//		page1.getContent().forEach(System.out::println);
//		
//		page1 = addressRepository.findAll(new PageRequest(1, 2));
//		page1.getContent().forEach(System.out::println);
//		
//		page1 = addressRepository.findAll(new PageRequest(2, 2));
//		page1.getContent().forEach(System.out::println);
//	}
//
//	private void findSort() {
//		
//		Order orderASC = new Order(Direction.ASC, "lastName");
//		Order orderDESC = new Order(Direction.ASC, "lastName");
//		
//		Sort sort = new Sort(orderASC, orderDESC);
//		
//		peopleRepository.findAll(sort).forEach(System.out::println);
//	}
//
//	private void testInsert() {
//		
//		Address address = new Address();
//		address.setCity("Araraquara");
//		address.setStreet("Rua do bobos");
//		
//		Person p1 = new Person();
//		
//		p1.setFirstName("Zé");
//		p1.setLastName("Fulano");
//		p1.setAge(29);
//		p1.setDocument(new Document("54654378954",480843421));
//		p1.setAddresses(Arrays.asList(address));
//		p1.addPhone(new Phone(TypePhone.CELULAR, "997542312"));
//		
//		peopleRepository.save(p1);
//		
//		System.out.println(peopleRepository.findOne(p1.getId()));
//		
//	}
//
//	public void testSelect() {
//		
//		addressRepository.findAll().forEach(System.out::println);
//		System.out.println("Total addres: "+addressRepository.count());
//		
//		documentRepository.findAll().forEach(System.out::println);
//		System.out.println("Total document: "+documentRepository.count());
//		
//		peopleRepository.findAll().forEach(System.out::println);
//		System.out.println("Total people: "+peopleRepository.count());
//		
//		phoneRepository.findAll().forEach(System.out::println);
//		System.out.println("Total phone: "+phoneRepository.count());
//	}

}
