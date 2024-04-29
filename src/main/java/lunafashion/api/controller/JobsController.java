package lunafashion.api.controller;

import lunafashion.api.job.DataRegisterJobs;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jobs")
public class JobsController {

    @PostMapping
    public void register(@RequestBody DataRegisterJobs jobs) {
        System.out.println(jobs);
    }
}
