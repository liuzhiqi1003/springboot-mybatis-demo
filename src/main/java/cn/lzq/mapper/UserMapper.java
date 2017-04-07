package cn.lzq.mapper;

import cn.lzq.entity.User;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zhiqi.liu@yoho.cn on 2017/3/24.
 */
@Mapper
public interface UserMapper {

    public User queryById(Integer id);

    @Select("SELECT id,username,`password`,create_time FROM t_user")
    public List<User> queryUsers();
}
