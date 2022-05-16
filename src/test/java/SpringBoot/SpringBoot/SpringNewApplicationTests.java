package SpringBoot.SpringBoot;

import SpringBoot.SpringBoot.DB.PeopleRepository;
import SpringBoot.SpringBoot.entity.PeopleModel;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestPropertySource(locations = "classpath:application-test.properties")
class SpringNewApplicationTests {

	@Autowired
	PeopleRepository pRepository;

	@Test
	@Order(1)
	public void testCreate () {
		PeopleModel record_1 = new PeopleModel(80,"I1k", "gogo", "Ivan","Gagarin", "male", "24", "123245", "4545", "i am Ivan", "88009992323", null);
		PeopleModel record_2 = new PeopleModel(2,"I1k2", "gogo", "Ivan","Gagarin", "male", "24", "223245", "4545", "i am Ivan", "88009992323", null);
		PeopleModel record_3 = new PeopleModel(84,"I1k", "gogo", "Ivan","Gagarin", "male", "24", "323245", "4545", "i am Ivan", "88009992323", null);
		PeopleModel record_4 = new PeopleModel(86,"I1k4", "gogo", "Ivan","Gagarin", "male", "24", "123245", "4545", "i am Ivan", "88009992323", null);
		PeopleModel record_5 = new PeopleModel(80,"I1k5", "gogo", "Ivan","Gagarin", "male", "24", "523245", "4545", "i am Ivan", "88009992323", null);
		PeopleModel record_6 = new PeopleModel(80,"I1k6", "gogo", "Ivan","Gagarin", "male", "24", "623245", "4545", "i am Ivan", "88009992323", "go");
		pRepository.save(record_1);
		pRepository.save(record_2);
		pRepository.save(record_3);
		pRepository.save(record_4);
		pRepository.save(record_5);
		pRepository.save(record_6);
		assertNotNull(pRepository.findById(1).get());
	}
	
//	@Test
//	@Order(2)
//	public void testReadAll() {
//		List<PeopleModel> people = (List<PeopleModel>) pRepository.findAll();
//		assertThat(people).size().isGreaterThan(0);
//	}

	@Test
	@Order(3)
	public void testSinglePeople() {
		PeopleModel people = pRepository.findById(60).get();
		assertEquals("Dargonax", people.getName());
	}

	@Test
	@Order(4)
	public void testUpdate() {
		PeopleModel people = pRepository.findById(60).get();
		people.setName("Dargonax");
		pRepository.save(people);
		assertNotEquals("Dark", pRepository.findById(60).get().getName());
	}

	@Test
	@Order(5)
	public void testDelete() {
		pRepository.deleteById(83);
		assertThat(pRepository.existsById(83)).isFalse();
	}


}
