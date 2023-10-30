package cn.tedu.egmvc1.controller;

import cn.tedu.egmvc1.pojo.vo.AddressVO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class InsertAddressController {
    @PostMapping("/insert")
    public String addAddress(@RequestParam("receiver") String receiver,
                             @RequestParam("address") String address,
                             @RequestParam("email") String email,
                             @RequestParam("mobile") String mobile,
                             @RequestParam("tag") String tag) {
        return "添加成功";
    }

    @GetMapping("/select")
    public AddressVO getAddress(@RequestParam("id") int id) {
        AddressVO addressVO = new AddressVO();
        return addressVO;
    }

    @GetMapping("/delete")
    public String deleteAddress(@RequestParam("id") int id) {
        return "删除成功";
    }
}
