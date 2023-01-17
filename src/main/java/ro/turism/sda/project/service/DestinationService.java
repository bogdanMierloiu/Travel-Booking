package ro.turism.sda.project.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.turism.sda.project.entity.Destination;
import ro.turism.sda.project.mapper.DestinationMapper;
import ro.turism.sda.project.mapper.model.destination.DestinationRequest;
import ro.turism.sda.project.mapper.model.destination.DestinationResponse;
import ro.turism.sda.project.repository.DestinationRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class DestinationService {
    private final DestinationRepository destinationRepository;
    private final DestinationMapper destinationMapper;

    public DestinationResponse add(DestinationRequest destinationRequest) {
        Destination destination = new Destination();
        destination.setDestinationName(destinationRequest.getDestinationName());
        destination.setPrice(destinationRequest.getPrice());
        return destinationMapper.map(destinationRepository.save(destination));
    }

    public void deleteById(int id) {
        destinationRepository.deleteById(id);
    }

    public List<DestinationResponse> getAll() {
        return destinationMapper.map(destinationRepository.findAll());
    }

    public void updateDestination(DestinationRequest destinationRequest) {
        Destination destination = destinationRepository.findById(destinationRequest.getId()).orElseThrow();
        destination.setDestinationName(destinationRequest.getDestinationName());
        destination.setPrice(destinationRequest.getPrice());
    }
}
