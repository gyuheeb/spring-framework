package com.douzone.container.videosystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations= {"classpath:com/douzone/container/config/videosystem/applicationContext.xml"})

public class DVDPlayerXmlConfigTest {
	
//	@Autowired
//	예외 발생
//	XML Bean Configuration(Avengers)에서는 자동으로 id를 부여하지 않는다.
//	@Qyalifier를 사용할 수 없다.
	DigitalVideoDisc dvd1;
	
	@Autowired
	@Qualifier("ironMan")
	DigitalVideoDisc dvd2;
	
	@Autowired
	@Qualifier("avengerInfinityWar")
	DigitalVideoDisc dvd3;
	
	@Autowired
	@Qualifier("avengerEndgame")
	DigitalVideoDisc dvd4;
	
	@Autowired
	@Qualifier("avengerAgeofUltron")
	DigitalVideoDisc dvd5;
	
	@Autowired
	@Qualifier("avengercaptiaonAmerica")
	DigitalVideoDisc dvd6;
	
	@Autowired
	@Qualifier("avengerDirectorEdition")
	DigitalVideoDisc dvd7;
	
	@Autowired 
	DVDPack dvdPack;
	
	@Autowired
	@Qualifier("avengerExpansionEdition1")
	DigitalVideoDisc dvd8;
	
	@Autowired
	@Qualifier("avengerExpansionEdition2")
	DigitalVideoDisc dvd9;
	
	@Autowired
	@Qualifier("avengerExpansionEdition3")
	DigitalVideoDisc dvd10;
	
	@Autowired
	@Qualifier("dvdPlayer1")
	DVDPlayer dvdPlayer1;
	
	@Autowired
	@Qualifier("dvdPlayer2")
	DVDPlayer dvdPlayer2;
	@Autowired
	@Qualifier("dvdPlayer3")
	DVDPlayer dvdPlayer3;
	@Autowired
	@Qualifier("dvdPlayer4")
	DVDPlayer dvdPlayer4;
	@Autowired
	@Qualifier("dvdPlayer5")
	DVDPlayer dvdPlayer5;
	//////////////////////////////////////////////
	
	@Disabled
	@Test
	public void testDVD1(){
		assertNotNull(dvd1);
	}
	@Test
	public void testDVD2(){
		assertNotNull(dvd2);
	}
	@Test
	public void testDVD3(){
		assertNotNull(dvd3);
	}
	@Test
	public void testDVD4(){
		assertNotNull(dvd4);
	}
	@Test
	public void testDVD5(){
		assertNotNull(dvd5);
	}
	@Test
	public void testDVD6(){
		assertNotNull(dvd6);
	}
	@Test
	public void testDVD7(){
		assertNotNull(dvd7);
	}
	
	@Test
	public void testDVDPack(){
		//System.out.println(dvdPack);
		assertNotNull(dvdPack);
	}
	
	@Test
	public void testDVD8(){
		assertNotNull(dvd8);
	}
	@Test
	public void testDVD9(){
		assertNotNull(dvd9);
	}
	@Test
	public void testDVD10(){
		assertNotNull(dvd10);
	}
	@Test
	public void testPlay1(){
		assertEquals("Playing Movie MARVEL's Ironman",dvdPlayer1.play());
	}
	@Test
	public void testPlay2(){
		assertEquals("Playing Movie MARVEL's Ironman",dvdPlayer2.play());
	}
	@Test
	public void testPlay3(){
		assertEquals("Playing Movie MARVEL's Ironman",dvdPlayer3.play());
	}
	@Test
	public void testPlay4(){
		assertEquals("Playing Movie MARVEL's Ironman",dvdPlayer4.play());
	}
	@Test
	public void testPlay5(){
		assertEquals("Playing Movie MARVEL's Ironman",dvdPlayer5.play());
	}
	
}