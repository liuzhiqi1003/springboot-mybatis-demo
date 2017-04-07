package cn.lzq.Service;

import cn.lzq.entity.User;
import cn.lzq.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhiqi.liu@yoho.cn on 2017/3/24.
 */
@Service
public class UserService {

    @Autowired
    public UserMapper userMapper;

    public User queryById(Integer id){
        return userMapper.queryById(id);
    }

    public PageInfo<User> queryUsers(int pageNum){
        PageHelper.startPage(pageNum, 2);
        return new PageInfo<User>(userMapper.queryUsers());

    }
}
