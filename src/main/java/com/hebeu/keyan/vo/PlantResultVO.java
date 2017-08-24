package com.hebeu.keyan.vo;

import com.hebeu.keyan.po.EPlant;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by Administrator on 2017/8/20.
 */
public class PlantResultVO extends EPlant {
    private MultipartFile file;
    private PersonListVO personListVO;
    private List<PersonListVO> personListVOList;
    private String submitType;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public PersonListVO getPersonListVO() {
        return personListVO;
    }

    public void setPersonListVO(PersonListVO personListVO) {
        this.personListVO = personListVO;
    }

    public List<PersonListVO> getPersonListVOList() {
        return personListVOList;
    }

    public void setPersonListVOList(List<PersonListVO> personListVOList) {
        this.personListVOList = personListVOList;
    }

    public String getSubmitType() {
        return submitType;
    }

    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }
}
