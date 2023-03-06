package net.avalon.gulimall.coupon;


import net.avalon.core.util.*;

/**
 * @Author: Weiyin
 * @Create: 2023/3/6 - 3:04
 */
public class JwtTest {
    public static void main(String[] args) throws AvalonException {
        String token = JwtUtil.createToken(new JwtUtil.User(1L, "xixi"), 60 * 5);
        System.out.println(token);
        ResponseBody ok = ResponseUtil.ok();
        System.out.println(ok);
        throw new AvalonException(AvalonStatus.OK,"xixi");
    }
}
