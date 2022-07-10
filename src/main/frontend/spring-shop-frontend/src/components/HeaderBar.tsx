import React from 'react';

export type HeaderBarProps = {
  logo?: string;
};

function HeaderBar({ logo }: HeaderBarProps) {
  return (
    <div className="header-bar">
      {logo && <img className="logo" src={logo} alt="Logo" />}
      <span>-</span>
    </div>
  );
}

export default HeaderBar;
