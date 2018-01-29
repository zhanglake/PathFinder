package com.zzh.dao;

import com.zzh.entity.Page;
import com.zzh.entity.User;
import com.zzh.entity.dto.SelectPageDto;
import com.zzh.entity.dto.UserSaveDto;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2017/12/20.
 */
@Repository
public interface UserDao {

    User findOne(Long id);

    User findOneWithDetail(Long id);

    Integer findCount();

    List<User> findList(Page page);

    Integer findCountByStatus(Boolean locked);

    List<User> findListByStatus(SelectPageDto pageDto);

    void deleteOne(Long userId);

    void resetPwd();

    void updateOne(UserSaveDto dto);

    void deleteUserRole(Long userId);

    void insertUserRole(List list);

    User selectForLogin(String userName);

}
