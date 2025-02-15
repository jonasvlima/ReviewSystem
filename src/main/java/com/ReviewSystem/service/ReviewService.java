package com.ReviewSystem.service;

import com.ReviewSystem.model.Review;
import com.ReviewSystem.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public Review saveReview(Review review) {
        return this.reviewRepository.save(review);
    }

    public Review getReview(Long id) {
        return this.reviewRepository.findById(id).orElse(null);
    }

    public Iterable<Review> getAllReviews() {
        return  this.reviewRepository.findAll();
    }

    public void deleteReview(Long id) {
        this.reviewRepository.deleteById(id);
    }
}
