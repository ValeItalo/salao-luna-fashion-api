package lunafashion.api.controller;

import lunafashion.api.job.DataRegisterJobs;
import lunafashion.api.job.Job;
import lunafashion.api.job.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jobs")
public class ServicesController {

    @Autowired
    private JobRepository repository;

    @PostMapping
    public void register(@RequestBody DataRegisterJobs data) {
        repository.save(new Job(data));
    }
}
