package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import com.plantee.domain.DiaryVO;

public interface DiaryDAO {
	public List<HashMap<String, Object>> list(DiaryVO vo);
}
