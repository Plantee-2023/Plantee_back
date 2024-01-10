package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import com.plantee.domain.MagazineVO;
import com.plantee.domain.QueryVO;

public interface MagazineDAO {
	public List<HashMap<String, Object>> list(QueryVO vo);
	public HashMap<String, Object> read(int post_id);
	public int total(QueryVO vo);
	public void insert(MagazineVO vo);
	public void update(MagazineVO vo);
	public void delete(int post_id);
	public void updateImage(MagazineVO vo);
}
