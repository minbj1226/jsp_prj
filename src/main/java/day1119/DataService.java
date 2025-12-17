package day1119;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataService {

	public List<ImgDTO> searchImg() {
		List<ImgDTO> list=null;
		DataDAO ddao=new DataDAO();
		
		if(new Random().nextBoolean()) {
			list=ddao.selectImg();
		}//end if
		
		if(list==null) {
			list=new ArrayList<ImgDTO>();
		}//end if
		
		return list;
	}//searchImg
	
}//class
