package info.fingo.urlopia.history;

import info.fingo.urlopia.request.AcceptanceDTO;
import info.fingo.urlopia.request.RequestDTO;
import info.fingo.urlopia.user.UserDTO;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Tomasz Pilarczyk
 */
public class HistoryDTO implements Serializable {
    private long id;
    private float hours;
    private LocalDateTime created;
    private UserDTO decider;
    private RequestDTO request;
    private UserDTO user;
    private List<AcceptanceDTO> acceptances;
    private int type;
    private String comment;

    public HistoryDTO(long id, float hours, LocalDateTime created, UserDTO decider, RequestDTO request, UserDTO user,
                      List<AcceptanceDTO> acceptances, String comment, int occasional) {
        this.id = id;
        this.hours = hours;
        this.created = created;
        this.decider = decider;
        this.request = request;
        this.user = user;
        this.acceptances = acceptances;
        this.comment = comment;
        this.type = occasional;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public UserDTO getDecider() {
        return decider;
    }

    public void setDecider(UserDTO decider) {
        this.decider = decider;
    }

    public RequestDTO getRequest() {
        return request;
    }

    public void setRequest(RequestDTO request) {
        this.request = request;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public List<AcceptanceDTO> getAcceptances() {
        return acceptances;
    }

    public void setAcceptances(List<AcceptanceDTO> acceptances) {
        this.acceptances = acceptances;
    }

    public String getComment() {
        return comment;
    }
}
