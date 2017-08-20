package cn.itcast.springboot.service;

import java.util.List;
import java.util.Map;

import cn.itcast.springboot.domain.Notice;

public interface NoticeService {
	/** 查询所有的公告 */
	public List<Notice> findAll();
	/** 分页查询公告 */
	public Map<String,Object> findByPage(Integer page, Integer rows);
}
