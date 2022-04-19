package com.ch.service.impl;

import com.ch.service.ManageTagService;
import com.ch.web.model.dto.tag.TagDTO;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * @author chenk
 * @date 2022/4/6 22:24
 * @description
 */
public class ManageTagServiceImpl implements ManageTagService {

    @Override
    public List<TagDTO> listAll() {
        return null;
    }

    @Override
    public List<TagDTO> listAllByIds(Collection<Integer> ids) {
        return null;
    }

    @Override
    public Optional<TagDTO> fetchById(Integer id) {
        return Optional.empty();
    }

    @Override
    public TagDTO getById(Integer id) {
        return null;
    }

    @Override
    public TagDTO getByIdOfNullable(Integer id) {
        return null;
    }

    @Override
    public boolean existsById(Integer id) {
        return false;
    }

    @Override
    public void mustExistById(Integer id) {

    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public TagDTO create(TagDTO D) {
        return null;
    }

    @Override
    public List<TagDTO> createInBatch(Collection<TagDTO> Ds) {
        return null;
    }

    @Override
    public TagDTO update(TagDTO D) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public List<TagDTO> updateInBatch(Collection<TagDTO> Ds) {
        return null;
    }

    @Override
    public TagDTO removeById(Integer id) {
        return null;
    }

    @Override
    public TagDTO removeByIdOfNullable(Integer id) {
        return null;
    }

    @Override
    public void remove(TagDTO D) {

    }

    @Override
    public void removeInBatch(Collection<Integer> ids) {

    }

    @Override
    public void removeAll(Collection<TagDTO> Ds) {

    }

    @Override
    public void removeAll() {

    }
}
