package com.agendaki.financially.services.user;

import com.agendaki.financially.dtos.user.PreUserSaveDTO;

public interface PreUserService {

    void save(PreUserSaveDTO userDTO);
}
