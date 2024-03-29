package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import com.plantee.domain.DiaryVO;

public interface DiaryDAO {
   public List<HashMap<String, Object>> list(DiaryVO vo);
   public HashMap<String, Object> read(int diary_id);
   public void insert(DiaryVO vo);
   public void update(DiaryVO vo);
   public void delete(int diary_id);
   public List<HashMap<String, Object>> storelist(DiaryVO vo);
   public void water_update(int diary_id);


}

