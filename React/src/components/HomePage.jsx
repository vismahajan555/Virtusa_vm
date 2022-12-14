import React, { useState } from 'react'
import { DropDown } from './DropDown'
import { ImageBox } from './ImageBox'
import { TopNav } from './TopNav'

export const HomePage = () => {
  const [selectedImage, setSelectedImage] = useState("") // state lifted up

    return (
    <>
        <TopNav/>
        {/* passing state as props */}
        <DropDown setSelectedImage={setSelectedImage} selectedImage={selectedImage}/> 
        <ImageBox selectedImage={selectedImage}/>
    </>
  )
}
