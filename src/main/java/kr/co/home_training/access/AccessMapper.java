package kr.co.home_training.access;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccessMapper {
    public Users selectId(Users users);
    public Users insertUser(Users users);
}
