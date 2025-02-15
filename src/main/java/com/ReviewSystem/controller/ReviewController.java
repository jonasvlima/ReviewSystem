package com.ReviewSystem.controller;

import com.ReviewSystem.model.Review;
import com.ReviewSystem.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviews")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Review createReview(@RequestBody Review review) {
        return this.reviewService.saveReview(review);
    }

    @GetMapping("/{id}")
    public Review getReview(@PathVariable Long id) {
        return this.reviewService.getReview(id);
    }

    @GetMapping
    public Iterable<Review> getAllReviews() {
        return this.reviewService.getAllReviews();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteReview(@PathVariable Long id) {
        this.reviewService.deleteReview(id);
    }
}
